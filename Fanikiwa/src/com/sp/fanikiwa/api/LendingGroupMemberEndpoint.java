package com.sp.fanikiwa.api;

import static com.sp.fanikiwa.api.OfyService.ofy;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.ConflictException;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.cmd.Query;
import com.sp.fanikiwa.entity.Lendinggroupmember;
import com.sp.fanikiwa.entity.Member;

	@Api(name = "lendinggroupmemberendpoint", namespace = @ApiNamespace(ownerDomain = "sp.com", ownerName = "sp.com", packagePath = "fanikiwa.entity"))
	public class LendingGroupMemberEndpoint {

		public LendingGroupMemberEndpoint() {

		}

		/**
		 * This method lists all the entities inserted in datastore. It uses HTTP
		 * GET method and paging support.
		 *
		 * @return A CollectionResponse class containing the list of all entities
		 *         persisted and a cursor to the next page.
		 */
		@SuppressWarnings({ "unchecked", "unused" })
		@ApiMethod(name = "listLendinggroupmember")
		public CollectionResponse<Lendinggroupmember> listLendinggroupmember(
				@Nullable @Named("cursor") String cursorString,
				@Nullable @Named("count") Integer count) {

			Query<Lendinggroupmember> query = ofy().load().type(Lendinggroupmember.class);
			return GetLendinggroupmembersFromQuery(query, cursorString, count);
		}

		@ApiMethod(name = "selectgroupMembers")
		public CollectionResponse<Lendinggroupmember> selectgroupMembers(
				@Named("groupname") String Groupname,
				@Nullable @Named("cursor") String cursorString,
				@Nullable @Named("count") Integer count) {

			Query<Lendinggroupmember> query = ofy().load().type(Lendinggroupmember.class)
					.filter("groupName", Groupname);
			return GetLendinggroupmembersFromQuery(query, cursorString, count);
		}


		private CollectionResponse<Lendinggroupmember> GetLendinggroupmembersFromQuery(Query<Lendinggroupmember> query,
				String cursorString, Integer count) {

			if (count != null)
				query.limit(count);
			if (cursorString != null && cursorString != "") {
				query = query.startAt(Cursor.fromWebSafeString(cursorString));
			}

			List<Lendinggroupmember> records = new ArrayList<Lendinggroupmember>();
			QueryResultIterator<Lendinggroupmember> iterator = query.iterator();
			int num = 0;
			while (iterator.hasNext()) {
				records.add(iterator.next());
				if (count != null) {
					num++;
					if (num == count)
						break;
				}
			}

			// Find the next cursor
			if (cursorString != null && cursorString != "") {
				Cursor cursor = iterator.getCursor();
				if (cursor != null) {
					cursorString = cursor.toWebSafeString();
				}
			}
			return CollectionResponse.<Lendinggroupmember> builder().setItems(records)
					.setNextPageToken(cursorString).build();
		}

		 

		/**
		 * This method gets the entity having primary key id. It uses HTTP GET
		 * method.
		 *
		 * @param id
		 *            the primary key of the java bean.
		 * @return The entity with primary key id.
		 */
		@ApiMethod(name = "getLendinggroupmemberByID")
		public Lendinggroupmember getLendinggroupmemberByID(@Named("groupId") Long id) {
			return findRecord(id);
		}

		/**
		 * This method is used for updating an existing entity. If the entity does
		 * not exist in the datastore, an exception is thrown. It uses HTTP PUT
		 * method.
		 *
		 * @param Lendinggroupmember
		 *            the entity to be updated.
		 * @return The updated entity.
		 * @throws NotFoundException
		 */
		@ApiMethod(name = "updateLendinggroupmember")
		public Lendinggroupmember updateLendinggroupmember(Lendinggroupmember Lendinggroupmember) throws NotFoundException {
			Lendinggroupmember record = findRecord(Lendinggroupmember.getId());
			if (record == null) {
				throw new NotFoundException("Record does not exist");
			}
			ofy().save().entities(Lendinggroupmember).now();
			return Lendinggroupmember;
		}

		/**
		 * This method removes the entity with primary key id. It uses HTTP DELETE
		 * method.
		 *
		 * @param id
		 *            the primary key of the entity to be deleted.
		 * @throws NotFoundException
		 */
		@ApiMethod(name = "removeLendinggroupmember")
		public void removeLendinggroupmember(@Named("id") Long id) throws NotFoundException {
			Lendinggroupmember record = findRecord(id);
			if (record == null) {
				throw new NotFoundException("Record does not exist");
			}
			ofy().delete().entity(record).now();
		}

		private Lendinggroupmember findRecord(Long id) {
			return ofy().load().type(Lendinggroupmember.class).id(id).now();
		}

		/**
		 * This inserts a new entity into App Engine datastore. If the entity
		 * already exists in the datastore, an exception is thrown. It uses HTTP
		 * POST method.
		 *
		 * @param Lendinggroupmember
		 *            the entity to be inserted.
		 * @return The inserted entity.
		 * @throws ConflictException
		 */
		//@ApiMethod(name = "insertLendinggroupmember")
		public Lendinggroupmember insertLendinggroupmember(Lendinggroupmember Lendinggroupmember) throws NotFoundException,
				ConflictException {
			if (Lendinggroupmember.getId() != null) {
				if (findRecord(Lendinggroupmember.getId()) != null) {
					throw new ConflictException("Object already exists");
				}
			}
			ofy().save().entities(Lendinggroupmember).now();
			return Lendinggroupmember;
		}

	}
